#CitiBankBg
- url命名方式驼峰命名
- url命名方式驼峰命名，后面加.htm后缀
public static String test() {

        Map map = new HashMap<String, String>();
        map.put("name", "ssss");
        map.put("school", "ssdut");
        JSONObject jsonObject = JSONObject.fromObject(map);
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }
    public static void parse(String Jsonstring) {
        JSONObject jsonObject = JSONObject.fromObject(Jsonstring);
        Map<String, String> map = (Map<String, String>) JSONObject.toBean(jsonObject, Map.class);
        System.out.print(map.get("name"));
    }

