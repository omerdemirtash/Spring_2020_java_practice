package _torba;

public class warmup {
    public static void main(String[] args) {


        String [] arr = {"A", "A", "B", "C", "C"};


                int count=0;
                for(String each:arr) {
                    for(String eachelmnt:arr){
                        if(each==eachelmnt) {
                            count++;

                            }

                        }
                    if(count==1){
                        System.out.println(each);

                    }
                    count=0;
                }


    }


}

/*



    warmup task:
        1.  write a return method that accepts a String and removes duplicate values from the String
        Ex:
        RemoveDuplicate("aaabbbccc");  ==> "abc"
        2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
        EX:
        Frequency("AAABB", "A");  ==> 3
        Frequency("ABAB", "B"); ==> 2
        3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can return the frequencyt of characters as a stringfrom any given string
        Ex:
        FrequencyOfChars("ABABCB"); ==> "A2B3C1";
        FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"



 */

