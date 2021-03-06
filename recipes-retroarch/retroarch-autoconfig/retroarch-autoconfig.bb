SUMMARY = "RetroArch joypad autoconfig files"
DESCRIPTION = "Autoconfig files included in this repository are used to \
recognize input devices and automatically setup default mappings between \
the physical device and Retropad virtual controller."

HOMEPAGE = "https://www.retroarch.com/"
BUGTRACKER = "https://github.com/libretro/retroarch-joypad-autoconfig/issues"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=459277d80461c2908b4cf14949f8dcd5"

S = "${WORKDIR}/git"
SRC_URI = "gitsm://github.com/libretro/retroarch-joypad-autoconfig.git;protocol=https"
SRCREV = "${AUTOREV}"

inherit allarch libretro-version retroarch-paths

do_configure[noexec] = "1"
do_compile[noexec] = "1"

FILES_${PN} += "${RETROARCH_AUTOCONFIG_DIR}"

do_install() {
  rm -f ${S}/Makefile \
    ${S}/configure

  install -m 0755 -d ${D}${RETROARCH_AUTOCONFIG_DIR}

  rm -f ${S}/Makefile \
    ${S}/configure
 
  cp -R --no-dereference --preserve=mode,links -v ${S}/* ${D}${RETROARCH_AUTOCONFIG_DIR}
}
