public class VowelOrNot {
    public static void main(String[] args){
        char letter='U';
        switch(Character.toLowerCase(letter)){
            case 'a': 
                System.out.println("It is a vowel : "+letter);
                break;
            case 'e': 
                System.out.println("It is a vowel : "+letter); 
                break;
            case 'i': 
                System.out.println("It is a vowel : "+letter);
                break;
            case 'o': 
                System.out.println("It is a vowel : "+letter); 
                break;
            case 'u': 
                System.out.println("It is a vowel : "+letter);      
                break;
            default:
                System.out.println("It is not a vowel");    

        }
    }
    
}
