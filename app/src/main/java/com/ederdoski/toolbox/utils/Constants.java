package com.ederdoski.toolbox.utils;

/**
 * Created by Eder on 24-10-2018.
 */
public class Constants {

    //------ GLOBALES

    public static final String URL = "https://api.puplinx.com/";

    public static final String EXTRA            = "EXTRA";
    public static final String EXTRA2           = "EXTRA2";

    public static final String NULL             = "null";

    public static final String CARROUSEL        = "[\n" +
            "             {\n" +
            "                 \"title\": \"Carrousel thumb\",\n" +
            "                 \"type\": \"thumb\",\n" +
            "                 \"items\": [\n" +
            "                             {\n" +
            "                                 \"title\": \"La Playa\",\n" +
            "                                 \"url\": \"http://placeimg.com/640/480/any\",\n" +
            "                                 \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "                             },\n" +
            "                             {\n" +
            "                             \"title\": \"Peligro en Bangkok \",\n" +
            "                             \"url\": \"http://placeimg.com/640/480/any\",\n" +
            "                             \"video\": \"\"\n" +
            "                             },\n" +
            "                             {\n" +
            "                            \"title\": \"Todas Contra Jhon\",\n" +
            "                            \"url\": \"http://placeimg.com/640/480/any\",\n" +
            "                             \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "                             },\n" +
            "                             {\n" +
            "                             \"title\": \"Quisiera ser millonario\",\n" +
            "                             \"url\": \"http://placeimg.com/640/480/any\",\n" +
            "                             \"video\": \"\"\n" +
            "                             }\n" +
            "                         ]\n" +
            "             },{\n" +
            "                 \"title\": \"Carrousel Poster\",\n" +
            "                \"type\": \"poster\",\n" +
            "\"items\": [\n" +
            "                 {\n" +
            "                 \"title\": \"La Playa\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/any\",\n" +
            "                 \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "                 },\n" +
            "                 {\n" +
            "                 \"title\": \"Quisiera ser millonario \",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/any\",\n" +
            "                 \"video\": \"\"\n" +
            "                },\n" +
            "                {\n" +
            "                 \"title\": \"Todas Contra Jhon\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/any\",\n" +
            "                 \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "                },\n" +
            "                 {\n" +
            "                 \"title\": \"Peligro en Bangkok\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/any\",\n" +
            "                 \"video\": \"\"\n" +
            "                 }\n" +
            "                 ]},\n" +
            "    {  \n" +
            "           \"title\":\"Carrousel Con Cache\",\n" +
            "           \"type\":\"random\",\n" +
            "           \"items\":[ {\n" +
            "                 \"title\": \"Todas Contra Jhon\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/animals\",\n" +
            "                 \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "            },\n" +
            "                 {\n" +
            "                 \"title\": \"La Playa 2 \",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/nature\",\n" +
            "                 \"video\": \"\"\n" +
            "                 },\n" +
            "                 {\n" +
            "                 \"title\": \"Peligro en Bangkok\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/architecture\",\n" +
            "                 \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "                 },\n" +
            "                 {\n" +
            "                 \"title\": \"Quisiera ser millonario\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/people\",\n" +
            "                 \"video\": \"\"\n" +
            "                 },\n" +
            "     {\n" +
            "                 \"title\": \"Imagen Prueba\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/tech\",\n" +
            "                \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "                 },\n" +
            "     {\n" +
            "                 \"title\": \"Otra Imagen\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/grayscale\",\n" +
            "                 \"video\": \"\"\n" +
            "                 },\n" +
            "     {\n" +
            "                 \"title\": \"Nueva\",\n" +
            "\"url\": \"http://placeimg.com/320/480/sepia\",\n" +
            "                 \"video\": \"\"\n" +
            "                 },\n" +
            "     {\n" +
            "                 \"title\": \"La Playa\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/nature\",\n" +
            "                 \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "                 }  ]},\n" +
            "{  \n" +
            "           \"title\":\"Carrousel Con Cache 2\",\n" +
            "           \"type\":\"random\",\n" +
            "           \"items\":[ {\n" +
            "                 \"title\": \"Todas Contra Jhon\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/animals\",\n" +
            "                 \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "            },\n" +
            "                 {\n" +
            "                 \"title\": \"La Playa 2 \",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/nature\",\n" +
            "                 \"video\": \"\"\n" +
            "                 },\n" +
            "                 {\n" +
            "                 \"title\": \"Peligro en Bangkok\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/architecture\",\n" +
            "                 \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "                 },\n" +
            "                 {\n" +
            "                 \"title\": \"Quisiera ser millonario\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/people\",\n" +
            "                 \"video\": \"\"\n" +
            "                 },\n" +
            "     {\n" +
            "                 \"title\": \"Imagen Prueba\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/tech\",\n" +
            "                \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "                 },\n" +
            "     {\n" +
            "                 \"title\": \"Otra Imagen\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/grayscale\",\n" +
            "                 \"video\": \"\"\n" +
            "                 },\n" +
            "     {\n" +
            "                 \"title\": \"Nueva\",\n" +
            "\"url\": \"http://placeimg.com/320/480/sepia\",\n" +
            "                 \"video\": \"\"\n" +
            "                 },\n" +
            "     {\n" +
            "                 \"title\": \"La Playa\",\n" +
            "                 \"url\": \"http://placeimg.com/320/480/nature\",\n" +
            "                 \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "                 }]\n" +
            "},\n" +
            "{\n" +
            "                 \"title\": \"Carrousel thumb\",\n" +
            "                 \"type\": \"thumb\",\n" +
            "                 \"items\": [\n" +
            "                             {\n" +
            "                                 \"title\": \"La Playa\",\n" +
            "                                 \"url\": \"http://placeimg.com/640/480/any\",\n" +
            "                                 \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "                             },\n" +
            "                             {\n" +
            "                             \"title\": \"Peligro en Bangkok \",\n" +
            "                             \"url\": \"http://placeimg.com/640/480/any\",\n" +
            "                             \"video\": \"\"\n" +
            "                             },\n" +
            "                             {\n" +
            "                            \"title\": \"Todas Contra Jhon\",\n" +
            "                            \"url\": \"http://placeimg.com/640/480/any\",\n" +
            "                             \"video\": \"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4\"\n" +
            "                             },\n" +
            "                             {\n" +
            "                             \"title\": \"Quisiera ser millonario\",\n" +
            "                             \"url\": \"http://placeimg.com/640/480/any\",\n" +
            "                             \"video\": \"\"\n" +
            "                             }\n" +
            "                         ]\n" +
            "             }]";

}
