import java.io.*;
import  java.util.*;

class UserMainCode {

    public int isPalindrome(String input1) {

        input1=input1.toLowerCase();
        int i,flag=1;
        for(i=0;i<input1.length()/2;i++)
        {
            if(input1.charAt(i)!=input1.charAt(input1.length()-i-1))
            {
                flag=0;
                break;
            }
        }
        if(flag==0)
        return 1;
        return 2;


    }
}
