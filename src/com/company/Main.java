package com.company;

public class Main {
    class  Chat{
        void start(){}
        void sendMessage(String message){}
    }
    void startChat(String chatId){
        String nickName = chatId;
        Chat chat = new Chat(){
            @Override
            public void start(){
                while (true){
                    String inputData = "안녕하세요";
                    String message = "["+nickName+"]";
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
}