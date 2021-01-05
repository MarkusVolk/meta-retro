SUMMARY = "MS-DOS emulator libretro core"
DESCRIPTION = "DOSBox Pure is a new fork of DOSBox built for RetroArch/Libretro \ 
aiming for simplicity and ease of use."

LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c050190136f70e95bb9873bf63cf427"

inherit libretro

LIBRETRO_GIT_REPO = "github.com/libretro/dosbox-pure.git"
LIBRETRO_GIT_BRANCH = "main"

LIBRETRO_CORE_PATCHES = "file://0001-Do-not-override-default-LDFLAGS.patch"

# Unable to compile with -Werror=format-security
SECURITY_STRINGFORMAT = "-Wformat -Wformat-security"

INFO_FILE = "dosbox_pure_libretro.info"

FILES_${PN} += "${RETROARCH_LIBRETRO_CORES_INFO_DIR}/${INFO_FILE}"

do_install_append() {
    install -d ${D}/${RETROARCH_LIBRETRO_CORES_INFO_DIR}
    install -m 644 ${S}/${INFO_FILE} ${D}/${RETROARCH_LIBRETRO_CORES_INFO_DIR}
}
