DESCRIPTION = "Retro menu launcher for retro distribution. Written in Qt / QML."
HOMEPAGE = "https://github.com/dev-0x7C6/retro-menu.git"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

inherit cmake_qt5

PR = "r1"

SRC_URI = "git://github.com/dev-0x7C6/retro-menu.git;protocol=https;branch=master"
SRCREV = "02c6616cbcd272a7f0ec798e596faa8262ccb9d2"
S = "${WORKDIR}/git"

PACKAGECONFIG ?= "quickcompiler"

PACKAGECONFIG[quickcompiler] = "-DENABLE_QT_QUICK_COMPILER=ON,-DENABLE_QT_QUICK_COMPILER=OFF,qtdeclarative-native"

DEPENDS = "qtbase qtgamepad qtquickcontrols2 qtsvg"
RDEPENDS_${PN} += "qtgamepad qtquickcontrols2 qtsvg"
