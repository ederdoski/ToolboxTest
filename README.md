# ToolboxTest

## Introducción

Proyecto de prueba, que muestra una lista de peliculas con 2 tipos de categorias, poster y thumbs, los mismos son cargados a travez de un JSON, mientras que las imagenes se generan aleatoriamente al hacer una solicitud a un servidor, los items pueden o no tener una película asociada que se reproducira al presionar la tarjeta.


## Librerias Usadas 

* [GSON JSON Parser](https://github.com/google/gson) - **implementation 'com.google.code.gson:gson:2.8.2'**
* [ReciclerView Support ]- **implementation 'com.android.support:recyclerview-v7:27.1.1'**

* [ButterKnife (code Generator)](https://github.com/JakeWharton/butterknife) - **implementation 'com.jakewharton:butterknife:8.8.1'**
* [Glide Image Load](https://github.com/bumptech/glide) - **implementation 'com.github.bumptech.glide:glide:4.6.1'**
* [Beauty Logger](https://github.com/orhanobut/logger) - **implementation 'com.orhanobut:logger:2.1.1'**
* [ExoPlayer Video Player](https://github.com/google/ExoPlayer) - **implementation 'com.google.android.exoplayer:exoplayer:2.9.0'**
* [Fonty Beauty Fonts](https://github.com/MarcinOrlowski/Fonty) - **'com.github.MarcinOrlowski:fonty:2.0.0'**
* [Text Responsive](https://github.com/intuit/sdp) - **implementation 'com.intuit.sdp:sdp-android:1.0.3'**
* [CardView Support] - **implementation 'com.android.support:cardview-v7:23.3.+'**

## Observaciones

* La aplicacion de ejemplo se encuentra en la ruta: [app --> release](https://github.com/ederdoski/ToolboxTest/tree/master/app/release) - **app-release.apk**

* Agregue una funcionalidad extra para guardar en cache las imagenes y evitar la carga por cada vez, sin embargo intencionalmente desactive el cache de los elementos "thumbs" y "poster" para que se observara que la carga contra el servidor se realizaba correctamente y no se repitiera la misma imagen siempre. 

* En la clase MoviesAdapter cree un metodo para poder controlar la cantidad de carrouseles que se muestran en pantalla, el mismo sirve para modificar tanto ancho como alto, pudiendo mostrar 2, 3 o 4 listas modificando automaticamente su tamaño.


## JSON ejemplo
	
```[  
   {  
      "title":"Carrousel thumb",
      "type":"thumb",
      "items":[  
         {  
            "title":"La Playa",
            "url":"http://placeimg.com/640/480/any",
            "video":"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
         },
         {  
            "title":"Peligro en Bangkok ",
            "url":"http://placeimg.com/640/480/any",
            "video":""
         },
         {  
            "title":"Todas Contra Jhon",
            "url":"http://placeimg.com/640/480/any",
            "video":"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
         },
         {  
            "title":"Quisiera ser millonario",
            "url":"http://placeimg.com/640/480/any",
            "video":""
         }
      ]
   },
   {  
      "title":"Carrousel Poster",
      "type":"poster",
      "items":[  
         {  
            "title":"La Playa",
            "url":"http://placeimg.com/320/480/any",
            "video":"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
         },
         {  
            "title":"Quisiera ser millonario ",
            "url":"http://placeimg.com/320/480/any",
            "video":""
         },
         {  
            "title":"Todas Contra Jhon",
            "url":"http://placeimg.com/320/480/any",
            "video":"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
         },
         {  
            "title":"Peligro en Bangkok",
            "url":"http://placeimg.com/320/480/any",
            "video":""
         }
      ]
   },
   {  
      "title":"Carrousel Con Cache",
      "type":"random",
      "items":[  
         {  
            "title":"Todas Contra Jhon",
            "url":"http://placeimg.com/320/480/animals",
            "video":"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
         },
         {  
            "title":"La Playa 2 ",
            "url":"http://placeimg.com/320/480/nature",
            "video":""
         },
         {  
            "title":"Peligro en Bangkok",
            "url":"http://placeimg.com/320/480/architecture",
            "video":"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
         },
         {  
            "title":"Quisiera ser millonario",
            "url":"http://placeimg.com/320/480/people",
            "video":""
         },
         {  
            "title":"Imagen Prueba",
            "url":"http://placeimg.com/320/480/tech",
            "video":"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
         },
         {  
            "title":"Otra Imagen",
            "url":"http://placeimg.com/320/480/grayscale",
            "video":""
         },
         {  
            "title":"Nueva",
            "url":"http://placeimg.com/320/480/sepia",
            "video":""
         },
         {  
            "title":"La Playa",
            "url":"http://placeimg.com/320/480/nature",
            "video":"http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
         }
      ]
   }
]```

## Autor

* **Edermar Dominguez** - [Ederdoski](https://gitlab.com/Ederdoski/about)

## Licencia

This code is open-sourced software licensed under the [MIT license.](https://opensource.org/licenses/MIT)

