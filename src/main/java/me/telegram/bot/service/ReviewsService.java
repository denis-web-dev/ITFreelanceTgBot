package me.telegram.bot.service;

import me.telegram.bot.TelegramBotApplication;

 class Main {

    private static final String BOT_TOKEN = "";

    private static final String PROVIDER_TOKEN = "";

    public static void main(String[] args) {
        TelegramBotApplication application = TelegramBotApplication.builder()
                .botToken(BOT_TOKEN)
                .providerToken(PROVIDER_TOKEN)
                .build();
        application.run();
    }

}