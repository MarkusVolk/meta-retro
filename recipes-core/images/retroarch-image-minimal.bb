IMAGE_INSTALL = " \
  packagegroup-core-boot \
  packagegroup-retroarch \
  ${CORE_IMAGE_EXTRA_INSTALL} \
  binutils \
  kernel-modules \
"

IMAGE_FSTYPES_append_qemux86-64 = " hddimg live"
IMAGE_FSTYPES_append_qemux86 = " hddimg live"

IMAGE_LINGUAS = ""

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"
