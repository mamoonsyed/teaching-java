/*
Just to give you an idea of the
time and space complexity of boxed
primitives.
*/

class BoxingPerformance {
    static void veryVeryExpensive() {
        System.out.println("\nInside veryVeryExpensive ...");
        Long sum = 0L; // note that sum is Long wrapped variable
        for(Long i=0L; i<Integer.MAX_VALUE; i++) { // even the iterator is boxed
            sum = sum+i;
        }
        /*
        more than twice as expensive than veryExpensive.
        */
    }

    static void veryExpensive() {
        System.out.println("\nInside veryExpensive ...");
        Long sum = 0L; // note that sum is Long wrapped variable
        for(long i=0; i<Integer.MAX_VALUE; i++) {
            sum = sum+i;
        }
        /*
        everytime sum has to do addition with "i", it is unwrapped,
        then the operation is performed, and then it is wrapped again.
        */
    }

    static void lessExpensive() {
        System.out.println("\nInside lessExpensive ...");
        long sum = 0L; // note that sum is long primitive
        for(long i=0; i<Integer.MAX_VALUE; i++) {
            sum = sum+i;
        }
    }

    public static void main(String[] args) {
        // using wrapped for iterator too
        long start = System.nanoTime();
        veryVeryExpensive();
        System.out.println("Elapsed Time: "+((System.nanoTime() - start)/1000000.0)+" mSec");
        
        // using wrapped type
        start = System.nanoTime();
        veryExpensive();
        System.out.println("Elapsed Time: "+((System.nanoTime() - start)/1000000.0)+" mSec");
        
        // using primitive
        start = System.nanoTime();
        lessExpensive();
        System.out.println("Elapsed Time: "+((System.nanoTime() - start)/1000000.0)+" mSec");
    }
}
/*
Inside veryVeryExpensive ...
Elapsed Time: 16729.448921 mSec

Inside veryExpensive ...
Elapsed Time: 7141.598058 mSec

Inside lessExpensive ...
Elapsed Time: 986.747357 mSec
*/