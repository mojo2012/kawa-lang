package io.spotnext.kawa;

import java.io.IOException;
import java.nio.charset.Charset;

import com.oracle.truffle.api.TruffleFile;

public final class KawaFileDetector implements TruffleFile.FileTypeDetector {

	@Override
	public String findMimeType(TruffleFile file) throws IOException {
		String name = file.getName();
		if (name != null && name.endsWith(".kawa")) {
			return KawaLanguage.MIME_TYPE;
		}
		return null;
	}

	@Override
	public Charset findEncoding(TruffleFile file) throws IOException {
		return null;
	}
}
