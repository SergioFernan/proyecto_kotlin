# FacturaFacil

Aplicacion movil Android desarrollada en Kotlin como soporte para la entrega academica del curso. El proyecto toma como guia la propuesta funcional del documento base y organiza la solucion alrededor de una pantalla principal con navegacion lateral y contenido dinamico.

## Descripcion general

FacturaFacil es una app orientada a la consulta y gestion basica de facturas de servicios. La interfaz presenta un panel izquierdo con las opciones del menu y un panel derecho que cambia segun la opcion elegida.

Las secciones implementadas son:

- `Perfil`: muestra informacion del usuario y contexto de uso de la app.
- `Fotos`: lista de facturas o comprobantes con descripcion al seleccionar cada elemento.
- `Video`: reproduccion de un video informativo con controles basicos.
- `Web`: carga de una URL dentro de un `WebView`.
- `Botones`: simulacion de acciones como registrar factura, marcar pago, consultar vencimientos, limpiar campos y mostrar alertas.

## Objetivo del proyecto

Construir una aplicacion Android en Kotlin que evidencie el uso de actividades, fragmentos, listas, eventos, contenido multimedia y navegacion entre componentes, dentro de un caso practico relacionado con la administracion de facturas.

## Alcance de la entrega

El proyecto cubre una estructura academica funcional para mostrar:

- actividad principal con dos contenedores visibles en pantalla;
- fragmento lateral usado como menu de navegacion;
- fragmento principal cuyo contenido cambia de acuerdo con la opcion seleccionada;
- uso de `RecyclerView` en el menu y en la seccion de fotos;
- manejo de eventos `onClick`;
- reproduccion de video;
- carga de paginas web;
- widgets de entrada y botones con respuestas visibles para el usuario.

## Relacion con los requerimientos

Esta seccion le puede servir al equipo para redactar el documento de entrega y relacionar la app con los puntos evaluables.

- `RF1`: la aplicacion muestra una actividad principal con dos zonas visibles al mismo tiempo.
- `RF2`: el panel izquierdo funciona como navegacion con las opciones `Perfil`, `Fotos`, `Video`, `Web` y `Botones`.
- `RF3`: el panel derecho cambia dinamicamente segun la opcion elegida.
- `RF4`: la vista `Perfil` presenta imagen e informacion basica del usuario.
- `RF5`: la vista `Fotos` presenta una lista desplazable.
- `RF6`: al seleccionar un elemento de `Fotos`, se muestra una descripcion asociada.
- `RF7`: la vista `Video` permite reproducir contenido multimedia.
- `RF8`: la vista `Web` permite ingresar una URL y cargarla en un `WebView`.
- `RF9`: la vista `Botones` implementa acciones representativas de la app.
- `RF10`: la app responde a eventos sobre menu, listas y botones.

## Estructura tecnica

- `MainActivity`: actividad principal que contiene los dos paneles.
- `MenuFragment`: menu lateral de navegacion.
- `ProfileFragment`: perfil del usuario.
- `PhotosFragment`: lista de fotos o comprobantes.
- `VideoFragment`: reproduccion multimedia.
- `WebFragment`: consulta de portales web.
- `ActionsFragment`: simulacion de acciones mediante botones.
- `MenuAdapter` y `PhotoAdapter`: adaptadores para listas.

## Tecnologias utilizadas

- `Kotlin`
- `Android SDK`
- `Fragments`
- `RecyclerView`
- `ViewBinding`
- `WebView`
- `VideoView`
- `Material Components`
- `Gradle`

## Flujo funcional sugerido para sustentar

El equipo puede usar este orden durante la presentacion o al redactar el documento:

1. Mostrar la pantalla principal y explicar la distribucion en dos paneles.
2. Explicar la navegacion lateral y el cambio de contenido.
3. Mostrar la seccion `Perfil` como ejemplo de informacion personalizada.
4. Mostrar `Fotos` y seleccionar un elemento para evidenciar eventos y descripcion.
5. Mostrar `Video` y usar reproducir, pausar o reiniciar.
6. Mostrar `Web` ingresando una URL valida.
7. Mostrar `Botones` ejecutando cada accion.

## Puntos que pueden incluir en el documento

Este bloque esta pensado para que mis companeros lo usen como base de redaccion.

### 1. Titulo del proyecto

`FacturaFacil: aplicacion movil Android para consulta, recordatorio y apoyo al pago de facturas`

### 2. Problema identificado

Muchas personas olvidan las fechas de vencimiento de sus facturas de servicios, lo que genera mora, desorganizacion financiera y riesgo de suspension del servicio. La aplicacion propone una interfaz centralizada para visualizar informacion, consultar soportes y apoyar el seguimiento de pagos.

### 3. Objetivo general

Disenar e implementar una aplicacion movil Android en Kotlin que permita evidenciar el uso de componentes fundamentales del desarrollo movil mediante un caso practico de gestion de facturas.

### 4. Objetivos especificos

- Implementar una actividad principal con navegacion por fragmentos.
- Organizar funcionalidades en secciones independientes y faciles de usar.
- Integrar controles de interfaz, listas, eventos, video y carga web.
- Presentar una interfaz clara y alineada con los requerimientos de la entrega.

### 5. Descripcion de la interfaz

- Panel izquierdo: menu de navegacion.
- Panel derecho: contenido asociado a la opcion elegida.
- Diseno: colores sobrios, tarjetas simples y distribucion enfocada en legibilidad.

### 6. Componentes Android usados

- `Activity`
- `Fragment`
- `RecyclerView`
- `EditText`
- `Button`
- `TextView`
- `ImageView`
- `VideoView`
- `WebView`
- `AlertDialog`
- `Toast`

### 7. Evidencias recomendadas

Para el documento o diapositivas se recomienda incluir capturas de:

- pantalla principal;
- seccion `Perfil`;
- seccion `Fotos` con una descripcion visible;
- seccion `Video`;
- seccion `Web` cargando una pagina;
- seccion `Botones` mostrando al menos dos acciones ejecutadas.

### 8. Posibles conclusiones

- El uso de fragmentos facilita la organizacion modular de la aplicacion.
- La integracion de distintos widgets permite cubrir varios escenarios de interaccion en una misma app.
- Kotlin y Android Studio ofrecen una base adecuada para desarrollar aplicaciones moviles academicas y funcionales.

## Como ejecutar el proyecto

1. Abrir el proyecto en `Android Studio`.
2. Esperar la sincronizacion de `Gradle`.
3. Seleccionar un emulador o dispositivo fisico.
4. Ejecutar la app desde `Run`.

## Mejoras futuras sugeridas

- Reemplazar iconos de ejemplo por imagenes reales de facturas.
- Guardar informacion en base de datos local.
- Agregar notificaciones de vencimiento.
- Permitir registrar historial de pagos.
- Mejorar el diseno responsive para mas tamanos de pantalla.

## Nota para el equipo

El contenido de este `README` no reemplaza el documento final de la entrega, pero si sirve como base para redactar:

- introduccion;
- planteamiento del problema;
- objetivos;
- descripcion funcional;
- relacion con requerimientos;
- conclusiones;
- evidencias del desarrollo.
