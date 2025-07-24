package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class BotClient extends Client {

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    protected String getUserName() {
        int number = (int) (Math.random() * 100);
        return "date_bot_" + number;
    }

    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }

    public class BotSocketThread extends SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);

            if (!message.contains(":")) return;
            String[] strings = message.split(":");
            String name = strings[0];
            String text = strings[1].trim();

            String format = null;

            if (text.equals("дата")) {
                format = "d.MM.YYYY";
            } else if (text.equals("день")) {
                format = "d";
            } else if (text.equals("месяц")) {
                format = "MMMM";
            } else if (text.equals("год")) {
                format = "YYYY";
            } else if (text.equals("время")) {
                format = "H:mm:ss";
            } else if (text.equals("час")) {
                format = "H";
            } else if (text.equals("минуты")) {
                format = "m";
            } else if (text.equals("секунды")) {
                format = "s";
            }
            if (Objects.nonNull(format)) {
                SimpleDateFormat dateFormat = new SimpleDateFormat(format);
                Calendar calendar = new GregorianCalendar();
                String time = dateFormat.format(calendar.getTime());
                sendTextMessage("Информация для " + name + ": " + time);
            }
        }
    }
}
