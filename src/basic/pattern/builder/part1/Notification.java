package basic.pattern.builder.part1;

public class Notification {
    private int a;
    private int b;
    private int c;
    private String d;
    private String e;
    private String f;
    
    private Notification(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
     }
 
	public static class Builder {
		// Require Fields
		private int a;
		private int b;
		private String d;
		
		// Option Fields
		private int c;
		private String e;
		private String f;
		
		public Builder(int a, int b, String d) {
		    this.a = a;
		    this.b = b;
		    this.d = d;
		}
		
		public Builder setBuilderC(int c) {
		    this.c = c;
		    return this;
		}
		
		public Builder setBuilderE(String e) {
		    this.e = e;
		    return this;
		}
		
		public Builder setBuilderF(String f) {
		    this.f = f;
		    return this;
		}
		
		public Notification build() {
		    return new Notification(this);
		}
	}
    
    public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}


	public String getD() {
		return d;
	}


	public void setD(String d) {
		this.d = d;
	}


	public String getE() {
		return e;
	}


	public void setE(String e) {
		this.e = e;
	}


	public String getF() {
		return f;
	}


	public void setF(String f) {
		this.f = f;
	}


	@Override
    public String toString() {
    	StringBuffer sb = new StringBuffer();
    	sb.append("a: " + getA() + "\r\n");
    	sb.append("b: " + getB() + "\r\n");
    	sb.append("c: " + getC() + "\r\n");
    	sb.append("d: " + getD() + "\r\n");
    	sb.append("e: " + getE() + "\r\n");
    	sb.append("f: " + getF() + "\r\n");
    	return sb.toString();
    }
}
