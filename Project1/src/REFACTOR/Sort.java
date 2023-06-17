package REFACTOR;
public class Sort {
	    int a;
	    int b;
	    int c;

	    public void descSort() {
	        descSortHelper();
	    }

	    private void descSortHelper() {
	        if (a < b) {
	            int temp = a;
	            a = b;
	            b = temp;
	        }
	        if (a < c) {
	            int temp = a;
	            a = c;
	            c = temp;
	        }
	        if (b < c) {
	            int temp = b;
	            b = c;
	            c = temp;
	        }
	    }
}
