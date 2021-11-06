package page;

public class Seletores {
	
	private String id;
	private String className;
	private String xpath;
	private String name;
	private String cssSelector;
	private String texto;
	
	public String getId() {
		return id;
	}
	public Seletores(String id, String className, String xpath, String cssSelector, String name, String texto) {
		super();
		this.id = id;
		this.className = className;
		this.xpath = xpath;
		this.name = name;
		this.cssSelector = cssSelector;
		this.texto = texto;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getXpath() {
		return xpath;
	}
	public void setXpath(String xpath) {
		this.xpath = xpath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCssSelector() {
		return cssSelector;
	}
	public void setCssSelector(String cssSelector) {
		this.cssSelector = cssSelector;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}

}
