package net.sourceforge.pmd.cpd;

import java.util.List;
import java.util.Properties;

public class PerlTokenizer implements Tokenizer {

	public void tokenize(SourceCode tokens, Tokens tokenEntries) {
		List<String> code = tokens.getCode();
		for (int i = 0; i < code.size(); i++) {
			String currentLine = code.get(i);
			for (int j = 0; j < currentLine.length(); j++) {
				char tok = currentLine.charAt(j);
				if (!Character.isWhitespace(tok) && tok != '{' && tok != '}' && tok != ';') {
					tokenEntries.add(new TokenEntry(String.valueOf(tok), tokens.getFileName(), i + 1));
				}
			}
		}
		tokenEntries.add(TokenEntry.getEOF());
	}

	public void setProperties(Properties properties) {
		// TODO Auto-generated method stub

	}
}
