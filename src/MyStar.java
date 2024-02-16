public class MyStar {

    public void myfirstprint(){

        System.out.println("Hello and welcome!\n");

        for (int i = 1; i <= 5; i++) {
            System.out.print("i = " + i + "; ");
        }
        System.out.print("\n");
//        *
//        **
//        ***
//        ****
//        *****
        for(int i = 1; i <= 5; i++) {
            for (int j=1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("------------------------------------------\n");
    }

    public void mysecondprint(){

//        ....*
//        ...***
//        ..*****
//        .*******
//        *********

        int n = 1;
        int m = 4;
        for(int i = 1; i <= 5; i++) {

            for (int k = 1; k <= m; k++){
                System.out.print(".");
            }
            m--;
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            n += 2;
            System.out.print("\n");
        }
    }

}
