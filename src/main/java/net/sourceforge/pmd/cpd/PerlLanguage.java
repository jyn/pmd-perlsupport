package net.sourceforge.pmd.cpd;

import java.util.Properties;

public class PerlLanguage extends AbstractLanguage {
	public PerlLanguage() {
		this(System.getProperties());
	}

	public PerlLanguage(Properties properties) {
		super(new PerlTokenizer(), ".pm", ".pl", ".t");
		PerlTokenizer tokenizer = (PerlTokenizer) getTokenizer();
		tokenizer.setProperties(properties);
	}
}
