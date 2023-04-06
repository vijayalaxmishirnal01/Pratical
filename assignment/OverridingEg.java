package assignment;

class Exam{ //parent class
	int marks() { //parent class method
		return 0;
	}
}
class comp extends Exam{ //child 1 class
	int marks() { //override method
		return 80;
	}
}
class math extends Exam{ //child 2 class
	int marks() { 
		return 70;
	}
}
class science extends Exam{ //child 3 class
	int marks() {
		return 50;
	}
}
class eng extends Exam{ //child 4 class
	int marks() {
		return 90;
	}	
}
//main class
class OverridingEg {
	public static void main(String[] args) {
		comp c=new comp();
		math m=new math();
		science s=new science();
		eng e=new eng();
		System.out.println("computer marks:"+c.marks());
		System.out.println("Math marks:"+m.marks());
		s.marks();
		e.marks();
	}
}

