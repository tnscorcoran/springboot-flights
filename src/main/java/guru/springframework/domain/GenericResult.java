package guru.springframework.domain;

public class GenericResult {
	private String summary;
	
	public GenericResult() {
		super();
	}

	public GenericResult(String summary) {
		super();
		this.summary = summary;
		
	}

	public String getSummary() {
		return summary;
	}

	
}