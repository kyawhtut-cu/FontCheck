# FontCheck
To Convert Myanmar Font Zawgyi to Unicode and reverse. And then, you can check user input text Font.

Example Usage.

FontUtil fontUtil = new FontUtil();

boolean isZawgyi = fontUtil.isZawgyi("နေကောင်းလား"); //this text is unicode text, so return is false

String zawgyiText = fontUtil.unicode2zawgyi("နေကောင်းလား"); //return is zawgyi text

String unicodeText = fontUtil.zawgyi2unicode("ေနေကာင္းလား"); //return is unicode text

ကဲ method တွေနဲ့ ပတ်သက်ပြီး အပြည့်အစုံကို သိချင်ရင် ဒီ Link(http://itnews.kyawhtut.com/public/fontconverter/) မှာ သွားကြည့်ပေးပါ။
