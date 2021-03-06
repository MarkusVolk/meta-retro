DESCRIPTION = "Snes9x - Portable Super Nintendo Entertainment System (TM) emulator."

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit libretro

LIBRETRO_GIT_REPO = "github.com/libretro/snes9x.git"

LIBRETRO_MAKEFILE_PREFIX = "libretro/"
LIBRETRO_CORE = "libretro/snes9x"
