package org.koitharu.kotatsu.parsers.site.madara.es

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.ContentType
import org.koitharu.kotatsu.parsers.model.MangaParserSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser
import org.koitharu.kotatsu.parsers.Broken

@Broken("Not dead, changed template")
@MangaSourceParser("MANGAXICO", "MangaXico", "es", ContentType.HENTAI)
internal class Mangaxico(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAXICO, "mangagojo18.com", 24)
