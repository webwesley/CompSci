package assignment3;

// represents the time of day in hours and minutes using the 
//military time format

public class Time {
	private int hours;
	private int minuets;

	public Time(int h, int m) {

		if (h < 0 || h > 24 || m < 0 || m > 60) {
			System.out.println("Those are not great numbers");
		}
		this.hours = h;
		this.minuets = m;
	}

	private int toMins() {
		return hours * 60 + minuets;
	}

	public boolean lessThan(Time t) {
		if (t.toMins() < this.toMins()) {
			return true;
		} else {
			return false;
		}
	}

	public int elapsedSince(Time t) {
		if (t.toMins() > this.toMins()) {
			return (1440 - t.toMins()) + this.toMins();
		} else {
			return (this.toMins() - t.toMins());
		}
	}package assignment3;

public class Time {
	private int hours;
	private int minuets;

	public Time(int h, int m) {

		if (h < 0 || h > 24 || m < 0 || m > 60) {
			System.out.println("Those are not great numbers");
		}
		this.hours = h;
		this.minuets = m;
	}

	private int toMins() {
		return hours * 60 + minuets;
	}

	public boolean lessThan(Time t) {
		if (t.toMins() < this.toMins()) {
			return true;
		} else {
			return false;
		}
	}

	public int elapsedSince(Time t) {
		if (t.toMins() > this.toMins()) {
			return (1440 - t.toMins()) + this.toMins();
		} else {
			return (this.toMins() - t.toMins());
		}
	}

	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minuets=" + minuets + "]";
	}
	

}


	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minuets=" + minuets + "]";
	}
	

}
