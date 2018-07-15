import java.util.Scanner;
class Main{
public static void main(String [] ZZZ){
   Scanner scan = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
   
                System.out.print("Numbwe Square : ");
		int num = scan.nextInt(); // รอรับข้อมูลมาเก็บในตัวแปร count

		for (int i = 0; i < num; i++) { // ควบคุมจำนวนบรรทัดเท่ากับ count
			for (int j = 0; j < num; j++) { // ควบคุมจำนวนที่จะวาดแต่ละบรรทัด
				if (i == 0 || i == (num - 1)) { // บรรทัดแรกและบรรทัดสุดท้าย
					System.out.print("*");
				} else {
					if (j == 0 || j == (num - 1)) { // ตำแหน่งแรกและตำแหน่งสุดท้าย
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}
		System.out.println();
	}
}
    
    /* Scanner input = new Scanner(System.in);
    System.out.print("Number Square : ");
    int num = input.nextInt();
    int i = 0 ;
    int j = 0 ;
    while(i < num){
        while(j < num){
        if( i == 0 || i == (num - 1)){
        System.out.print("*");
        
        }else {
		if (j == 0 || j == (num - 1)) { // ตำแหน่งแรกและตำแหน่งสุดท้าย
			System.out.print("*");
		} else {
			System.out.print(" ");
		}
        }
            
            j = j + 1;
        }
        System.out.println();
        i=i+1;
    }
    System.out.println();
}
} */
