import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Sicaklik değişkeni tanımlama
        int heat;
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan sıcaklık değeri alındı
        System.out.println("Sıcaklık Giriniz : ");
        heat=input.nextInt();

        //girilen sıcaklık değerine göre etkinlik önerisi veriyor
        if(heat<5){
            System.out.println("Hava tam kayak yapmalık");
        }
        else if((heat>=5) && (heat<15)){
            System.out.println("Hava tam Sinema havası ");
        }

        else if((heat>=15) && (heat<25)){
            System.out.println("Hava tam Piknik havası ");
        }
        else if(heat>=25){
            System.out.println("Hava tam Yüzme havası ");
        }
    }
}