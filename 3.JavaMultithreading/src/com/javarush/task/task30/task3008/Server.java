package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void sendBroadcastMessage(Message message) {
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Не смогли отправить сообщение");
            }
        }
    }

    public static void main(String[] args) {
        ConsoleHelper.writeMessage("Введите порт сервера");
        int port = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(port)
        ) {
            System.out.println("Сервер чата запущен");
            while (true) {
                Socket accept = serverSocket.accept();
                Handler handler = new Handler(accept);
                handler.start();
            }
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Произошла ошибка во время работы сервера.");
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST, "Пожалуйста, введите Ваше имя"));
                Message message = connection.receive();
                String name = message.getData();
                if (message.getType() == MessageType.USER_NAME &&
                        Objects.nonNull(name) && !name.isEmpty() &&
                        !connectionMap.containsKey(name)) {
                    connectionMap.put(name, connection);
                    connection.send(new Message(MessageType.NAME_ACCEPTED, "Добро пожаловать в чат!"));
                    return name;
                } else {
                    ConsoleHelper.writeMessage("Введен неверный тип сообщения или некорректное имя");
                }
            }
        }
    }
}
