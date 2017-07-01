package com.agoranerd.smartcomponentslibrary.utils;




/**
 * @author Guilherme Santana
 *
 */

public enum EFontType {


	CLEAR_SANS_REGULAR("clear_sans", "fonts/ClearSans-Regular.ttf"),
	CLEAR_SANS_BOLD("clear_sans_bold", "fonts/ClearSans-Bold.ttf"),
	CLEAR_SANS_MEDIUM("clear_sans_medium", "fonts/ClearSans-Medium.ttf"),
	ROBOTO_BLACK("roboto_black", "fonts/Roboto-Black.ttf"),
	ROBOTO_BLACK_ITALIC("roboto_black_italic", "fonts/Roboto-BlackItalic.ttf"),
	ROBOTO_BOLD("roboto_bold", "fonts/Roboto-Bold.ttf"),
	ROBOTO_BOLD_ITALIC("roboto_bold_italic", "fonts/Roboto-BoldItalic.ttf"),
	ROBOTO_ITALIC("roboto_italic", "fonts/Roboto-Italic.ttf"),
	ROBOTO_LIGHT("roboto_light", "fonts/Roboto-Light.ttf"),
	ROBOTO_LIGHT_ITALIC("roboto_light_italic", "fonts/Roboto-LightItalic.ttf"),
	ROBOTO_MEDIUM("roboto_medium", "fonts/Roboto-Medium.ttf"),
	ROBOTO_MEDIUM_ITALIC("roboto_medium_italic", "fonts/Roboto-MediumItalic.ttf"),
	ROBOTO_REGULAR("roboto_regular", "fonts/Roboto-Regular.ttf"),
	ROBOTO_THIN("roboto_thin", "fonts/Roboto-Thin.ttf"),
	ROBOTO_THIN_ITALIC("roboto_thin_italic", "fonts/Roboto-ThinItalic.ttf");


	private String mFontName;
	private String mFontPath;

	EFontType(final String fontName, final String fontPath) {
		mFontName = fontName;
		mFontPath = fontPath;
	}

	public String getFontName() {
		return mFontName;
	}

	public String getFontPath() {
		return mFontPath;
	}

	public static EFontType getFontByName(final String fontName) {
		for (final EFontType fontType : EFontType.values()) {
			if (fontType.getFontName().equalsIgnoreCase(fontName)) {
				return fontType;
			}
		}
		return null;
	}

}
