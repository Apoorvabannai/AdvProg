package StringPractiseQuestions;

public class FindingVowels {
  public static void main(String[]args){
     findVowels("This is shaka and shake");
     vowelAndConsonant("This and that words and you do it babe");
  }
  public static void findVowels(String input){
    int vovelCount = 0;
    int consonentCount = 0;
    input = input.toLowerCase();
    for(int i = 0; i< input.length();i++){
       char charecter =  input.charAt(i);
       if(charecter == 'a'|| charecter == 'e'||charecter == 'i'||charecter == 'o'||charecter == 'u'){
         vovelCount = vovelCount+1;
       }
       else if( charecter >= 'a'&& charecter<= 'z') {
         consonentCount++;
       }
    }
    System.out.println("Vowel count "+ vovelCount);
    System.out.println("consonent count "+ consonentCount);
  }
    public static  void vowelAndConsonant(String input){
    String stringInput = input.replace(" ","");
    String vowels = "aeiou";
    String [] vowelsSplit = vowels.split("");
    String [] stringInputArray = stringInput.split("");
//     for(String s1 :stringInputArray){
//       System.out.print(s1);
//     }
//     System.out.println (" ");
//     for(String v1: vowelsSplit){
//       System.out.print(v1);
//     }

    }
}
