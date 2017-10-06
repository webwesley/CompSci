package assignment3;
//represents a rectangle with integer width and height

public class Rectangle {
	int width;
	int height;
		
	public Rectangle() {
		this.width = 1;
		this.height = 1;
		
	}

	public Rectangle(int height, int width) {
		if (height > 0 || width > 0) {
			this.height = height;
			this.width = width;
		} else {
			System.out.println("Nope");
		}
	}

	System.out.println("Nope");
}
}
	public Rectangle(int length) {
		this.width = length;
		this.height = length;
	}
	
	public boolean isSquare() {
		if(width == height) {
			return true;
		} else {
			return false;
		}
	}
	
	public void quadratize() {
		if(!isSquare()) {
			int area = width * height;
			int i;
			for(i = 1; i*i <= area; i++) {}
			this.width = i;
			this.height = i;
		}
	}

}
