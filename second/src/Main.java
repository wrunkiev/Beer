import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        //InputStream inputStream = System.in;
        //Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Возраст: ");
        String age = reader.readLine();

        System.out.print("Кол-во денег: ");
        String money = reader.readLine();

        System.out.print("Борода? ");
        String beard = reader.readLine();


        int iAge = Integer.parseInt(age);
        int iMoney = Integer.parseInt(money);
        boolean bBeard = Boolean.parseBoolean(beard);

        if(iAge >= 18 && iMoney >= 20)
        {
            System.out.println("Ваше пиво сер");
        }
        else if(iMoney < 20)
        {
            System.out.println("Нужно больше золота");
        }
        else if(iAge < 18)
        {
            System.out.println("Drink milk, please");
        }
        else if(bBeard)
        {
            System.out.println("Боярышника сударь");
        }
        else
        {
            System.out.println("Побег");
        }
    }
}
