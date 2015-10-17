import com.projetloki.genesis.CssBuilder;
import com.projetloki.genesis.CssModule;
import com.projetloki.genesis.Properties;



//Librairie Genesis (http://grepcode.com/snapshot/repo1.maven.org/maven2/com.projetloki/genesis/0.79/)

public class ExampleGplJava {
	
	static final CssModule MY_DIV_CSS_MODULE = new CssModule() {
		   @Override public void configure(CssBuilder out) {
		     out.addRule("div.myDiv", Properties.builder()
			         .setWidthPx(80)
			         .setHeightPx(50));
		   }
		 };
}
