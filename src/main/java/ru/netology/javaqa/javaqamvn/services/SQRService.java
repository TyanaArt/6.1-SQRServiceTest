package ru.netology.javaqa.javaqamvn.services;

public class SQRService {

    public int numberSquare(int minNumber, int maxNumber){

        int x = 0;
        for (int i = 10; i * i <= maxNumber; i++){

            if ((i * i >= minNumber) && (i * i <= maxNumber)){
                x = x + 1;
            }
            if (i == 99){
                break;
            }
        }
        return x;
    }
}
