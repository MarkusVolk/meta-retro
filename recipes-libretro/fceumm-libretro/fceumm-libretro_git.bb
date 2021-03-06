LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit libretro

LIBRETRO_CORE = "fceumm"
LIBRETRO_GIT_REPO = "github.com/libretro/libretro-fceumm.git"

LIBRETRO_EXTRA_CFLAGS = "-std=gnu11"
LIBRETRO_EXTRA_CFLAGS_append_armarch = " -DARM"
LIBRETRO_EXTRA_CXXFLAGS = "-std=gnu++11"
LIBRETRO_EXTRA_CXXFLAGS_append_armarch = " -DARM"

