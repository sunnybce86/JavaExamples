package JavaExaplePractice.JavaExaplePractice;

@SuppressWarnings("serial")
class CustomException extends Exception {
	   int id;

	   public CustomException(int x) {
	      this.id = x;
	   }

	@Override
	public String toString() {
		return "CustomException [this id is not allowed becuase it is less lhen 18 and id is " + id + "]";
	}

	   
}


 