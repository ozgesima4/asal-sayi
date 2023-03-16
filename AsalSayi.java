package asalsayi;
public class AsalSayi {

    public static void main(String[] args) {
       
        for (int i = 2; i < 100; i++) {  //2 ile 100 arasındaki sayiları bulucaz
            int sayac=0;  //sayaç atadık
            for (int j = 1; j <=i; j++) {  //i sırasıyla geliyır ya ona gelene kadar birden baslayarak 
                if(i%j==0){  //kalanlarına bakarız her kalanda bir arttırırız
                    sayac++;
                }      
            }
            if(sayac<=2){  //kendi ve birdn baskasına bölünmeyeceğinden eğer ikiye eşitse sayiyi yazdır değilse geç
                System.out.print(i+" ");
            }
            
        }
      
    }
    
}
