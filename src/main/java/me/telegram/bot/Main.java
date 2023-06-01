package me.telegram.bot;


public class Main {

    private static final String BOT_TOKEN = "6180918332:AAFbG8FUGiNvwU9Adi8MAJAsyHZoQNOWtOo"; //Токен ключ телеграмм бота

    private static final String PROVIDER_TOKEN = "401643678:TEST:aec55839-9338-4c0c-9e78-355d0a7c589f"; //Токен ключ от Сбербанка для платёжной системы

    public static void main(String[] args) {
        TelegramBotApplication application = TelegramBotApplication.builder()
                .botToken(BOT_TOKEN)
                .providerToken(PROVIDER_TOKEN)
                .build();
        application.run();
    }

}