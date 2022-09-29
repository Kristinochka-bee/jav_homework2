public class Converter {
    public static void main(String[] args) {

        //0. Перевести число 478 из шестнадцатеричной в десятичную
        String hex_number = "478";
        int dec_number = Integer.parseInt(hex_number, 16); // 16->10
        System.out.println(dec_number);

        //1. Разложить число 200345 на разряды в десятичной системе //1й урок
        //int number = 200345;
        //int result =



       //2.  Перевести 637 из десятичной в шестнадцатеричную и обратно (10->16 и 16->10)
        int dec = 637;
        System.out.println(Integer.toHexString(dec));// 10 ->16

        String hex = "27d";
        int dec1 = Integer.parseInt(hex, 16); // // 16 ->10
        System.out.println(dec1);


        // 3. Перевести 637 из десятичной в двоичную
        int dec2 = 637;
        String bin = Integer.toBinaryString(dec2);
        System.out.println(bin);                    //10 ->2

        // 4. 11100111 перевести в десятичную
        String bin1 = "11100111";
        int dec3 = Integer.parseInt(bin1,2); //2 ->10
        System.out.println(dec3);


        // 5. Перевести 637 из десятичной в троичную
        //String dec4 = "637";
      //  int three = Integer.parseInt(dec4,3);
        //System.out.println(three);


    }
}
