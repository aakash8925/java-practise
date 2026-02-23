package mycodes;

public class CountLetters {

    public static void main(String[] args) {
    	

        String name = "pneumonoultramicroscopicsilicovolcanoconiosis".toLowerCase();

        for (int i = 0; i < name.length(); i++) {

        	int count = 0;
            char ch = name.charAt(i);
            boolean Iscounted = false;
            
            for(int k=0 ; k<i ; k++) {
            	if(ch == name.charAt(k)) {
            		Iscounted = true;
            		break;
            	}
            }
            
            if(Iscounted) {
            	continue;
            }
            for (int j = 0; j < name.length(); j++) {
                if (ch == name.charAt(j)) {
                    count++;
                }
            }
           System.out.println(ch + "  " + count);
        }
    }
}

