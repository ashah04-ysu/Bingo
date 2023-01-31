package bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Stack;


public class BingoCard {
    private Integer randomNumber;
    private String randomNumbers;
    private String [] BingoNumbers;
    List <Integer> numbers = new ArrayList();
    
    public BingoCard(){
        for (int i = 0; i< 75; i++){
            numbers.add(i+1);
            System.out.print(numbers.get(i));
        }
        Collections.shuffle(numbers);
        
        randomNumber = numbers.remove(0);
        if (randomNumber < 16){
            randomNumbers = "B" + randomNumber.toString();
        }
        
        else if (randomNumber >=16 && randomNumber < 31){
            randomNumbers = "I" + randomNumber.toString();
        }
        
        else if (randomNumber >=31 && randomNumber < 46){
            randomNumbers = "N" + randomNumber.toString();
        }
        
        else if (randomNumber >=46 && randomNumber < 61){
            randomNumbers = "G" + randomNumber.toString();
        }
        
        else if (randomNumber >=61 && randomNumber < 76){
            randomNumbers = "O" + randomNumber.toString();
        }
    }

    public String getRandomNumbers() {
        return randomNumbers;
    }

    
    
    
    
    
      
    
}
