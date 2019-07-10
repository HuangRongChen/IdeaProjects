public class add1to100 {

    public static void main(String[] args){
        int n=10 ;
        if ( n <= 0 ){
            System.out.println("参数n不允许小于0");
            return;
        }
        forText(n);
        whileText(n);
        doWhileTexe( n );
        gaosiText( n );

/*		for( int i = 0 ; i < 20 ; i ++ ){
			forText( i );
		}
*/	}

    public static void forText( int n ){
        int sum = 0 ;
        for ( int i = 1 ; i <= n ; i ++){
            sum = sum+i;
        }
        System.out.println("forText: " + sum );
    }

    public static void whileText( int n ){
        int i = 0 ;
        int sum = 0 ;
        while ( i <= n ){
            sum = sum + i ;
            i++;
        }
        System.out.println("whileText: " + sum );
    }

    public static void doWhileTexe( int n ){
        int i = 0 ;
        int sum = 0 ;
        do {
            sum = sum + i ;
            i++;
        }
        while ( i <= n);
        System.out.println("doWhileText: " + sum );
    }

    public static void gaosiText( int n ){
        int i = 1 ;
        int sum ;
        sum = ( i + n) * n / 2;
        System.out.println("gaosiText: " + sum );
    }
}