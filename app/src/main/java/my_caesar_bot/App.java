package my_caesar_bot;

import org.telegram.telegrambots.meta.TelegramBotsApi;

import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import my_caesar_bot.Config;

public class App {
    public String getGreeting(){
        return "Hello World";
    }

    public static void main(String[] args) {
        // Instantiate Telegram Bots API
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new MyAmazingBot());
        // Register our bot
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}