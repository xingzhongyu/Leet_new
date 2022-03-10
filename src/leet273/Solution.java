package leet273;

public class Solution {
    int bi= (int) Math.pow(10,9);
    int mi= (int) Math.pow(10,6);
    int th=1000;
    int hundred=100;



    public String numberToWords(int num) {
        if(num>=bi){

            if (num%bi==0){
                return numberToWords(num/bi)+" Billion";
            }
            return numberToWords(num/bi)+" Billion "+numberToWords(num%bi).trim();
        }else {

            return number(num).trim();
        }

    }
    public String number(int num){
        if (num>=mi){
            if (num%mi==0){
                return number(num/mi)+" Million";
            }
            return number(num/mi)+" Million "+number(num%mi).trim();
        }
        if (num>=th){
            if (num%th==0){
                return number(num/th)+" Thousand";
            }
            return number(num/th)+" Thousand "+number(num%th).trim();
        }
        if (num>=hundred){
            if (num%hundred==0){
                return number(num/hundred)+" Hundred";
            }
            return number(num/hundred)+" Hundred "+number(num%hundred).trim();
        }
        if (num/10>1){
            if (num%10==0){
                return getTen(num/10);

            }
                return getTen(num/10)+" "+getNum(num%10);

        }
        if (num/10==1){
            return getTen2(num);
        }

        return getNum(num);
    }
    public String getTen(int num){
        return switch (num) {
            case 9 -> "Ninety";
            case 8 -> "Eighty";
            case 7 -> "Seventy";
            case 6 -> "Sixty";
            case 5 -> "Fifty";
            case 4 -> "Forty";
            case 3 -> "Thirty";
            case 2 -> "Twenty";
            default -> "";
        };
    }
    public String getTen2(int num){
        return switch (num){
            case 10-> "Ten";
            case 11->"Eleven";
            case 12->"Twelve";
            case 13->"Thirteen";
            case 14->"Fourteen";
            case 15->"Fifteen";
            case 16->"Sixteen";
            case 17->"Seventeen";
            case 18->"Eighteen";
            case 19->"Nineteen";
            default -> "";
        };
    }
    public String getNum(int num){
        return switch (num){
            case 0->"Zero";
            case 1->"One";
            case 2->"Two";
            case 3->"Three";
            case 4->"Four";
            case 5->"Five";
            case 6->"Six";
            case 7->"Seven";
            case 8->"Eight";
            case 9->"Nine";
            default -> "";

        };

    }


}
