
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test ThreadPool
//		Run r = new Run(0);
//		r.run();
		
		
		//So sanh thoi gian xu ly String va StringBuilder
		int lap = 100000;
        String str = "start";
        StringBuilder sb = new StringBuilder("start");
        long bd= System.currentTimeMillis();
        for (int i = 0; i < lap; i++) {
            str += "text";
        }
        long kt = System.currentTimeMillis();
        System.out.println("String: " + (kt - bd) + " ms");
        
        bd = System.currentTimeMillis();
        for (int i = 0; i < lap; i++) {
            sb.append("text");
        }
        kt = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (kt - bd) + " ms");

        
        //Test gia tri bien tham tri
        ThamTri tt = new ThamTri();
        System.out.println("Truoc khi thay doi: " + tt.x);
        tt.sumX(tt.x);
        System.out.println("Sau khi thay doi: " + tt.x);

        //Test bien tham chieu
        Person p = new Person("Huyen", 21);
        System.out.println("Truoc khi thay doi: " + p.getAge());
        p.setAge(p.getAge() + 1);
        System.out.println("Sau khi thay doi: " + p.getAge());
	}

}
