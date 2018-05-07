package hello;

public class Addition {

    private final long a1;
    private final long a2;
    private final long result;

    public Addition(long a1, long a2) {
        this.a1 = a1;
        this.a2 = a2;
        this.result = this.a1 + this.a2;
    }

	public long getA1() {
		return a1;
	}

	public long getA2() {
		return a2;
	}

	public long getResult() {
		return result;
	}

}