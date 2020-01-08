## OpenEmbedded / Yocto software layer for RetroArch and libretro cores

This layer provides RetroArch front-end and libretro cores emulators
recipes for use with OpenEmbedded and/or Yocto.

![Raspberry Pi 4 Poky build](https://devwork.space/wp-content/uploads/2020/01/IMG_20200108_205652-scaled.jpg)

## Dependencies
This layer depends on:
```
  URI: git://git.yoctoproject.org/poky.git
  layers: meta
  branch: zeus
  
  URI: git://git.yoctoproject.org/poky.git
  layers: meta-poky
  branch: zeus
  
  URI: git://git.yoctoproject.org/poky.git
  layers: meta-yocto-bsp
  branch: zeus

  URI: git://git.openembedded.org/meta-openembedded
  layers: meta-oe
  branch: zeus
  
  URI: git://git.openembedded.org/meta-openembedded
  layers: meta-multimedia
  branch: zeus
  
  URI: git://git.openembedded.org/meta-openembedded
  layers: meta-networking
  branch: zeus
  
  URI: git://git.openembedded.org/meta-openembedded
  layers: meta-python
  branch: zeus
```

## Patches

Please submit any patches against the meta-retro layer by pull requests.

## Adding the meta-retro layer to your build

In order to use this layer, you need to make the build system aware of
it.

Assuming the meta-retro layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the meta-retro layer to bblayers.conf, along with any
other layers needed. e.g.:
```
BBLAYERS ?= " \
  /path/to/yocto/meta \
  /path/to/yocto/meta-yocto \
  /path/to/yocto/meta-yocto-bsp \
  /path/to/yocto/meta-retro \
"
```
