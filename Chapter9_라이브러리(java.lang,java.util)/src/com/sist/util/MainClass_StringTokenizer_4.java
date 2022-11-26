package com.sist.util;
//	"https://mp-seoul-image-production-s3.mangoplate.com/280481/651548_1488006727915_2029?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
//	+"https://mp-seoul-image-production-s3.mangoplate.com/280481/2221540_1667797407433_25992?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
//	+"https://mp-seoul-image-production-s3.mangoplate.com/280481/2221540_1667797407433_25993?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
//	+"https://mp-seoul-image-production-s3.mangoplate.com/280481/30105_1663470371444_54840?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";

public class MainClass_StringTokenizer_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String image ="https:mp-seoul-image-production-s3.mangoplate.com/280481/651548_1488006727915_2029?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
				+"https:mp-seoul-image-production-s3.mangoplate.com/280481/2221540_1667797407433_25992?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
				+"https:mp-seoul-image-production-s3.mangoplate.com/280481/2221540_1667797407433_25993?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
				+"https:mp-seoul-image-production-s3.mangoplate.com/280481/30105_1663470371444_54840?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
		// 여러개를 구분(StringTokenizer) -> 동시에 가져오려고 하면!!
		// 한개를 자른다 (substring) -> 따로 따로 가져올 때
		String firstImage = image.substring(0,image.indexOf("^"));
		System.out.println(firstImage);
		String lImage = image.substring(0,image.indexOf("^"));
		System.out.println(lImage);
	}

}
