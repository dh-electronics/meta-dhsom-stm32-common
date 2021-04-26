LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"
DESCRIPTION = "Install scripts and supportfiles to handle the update process"

S = "${WORKDIR}/"
SRC_URI = "file://swupdate-handler.sh"

do_install () {
	install -d ${D}${INIT_D_DIR}/
	install -d ${D}${sysconfdir}/rcS.d
	install -m 755 ${S}/${INITSCRIPT_NAME} ${D}${INIT_D_DIR}/${INITSCRIPT_NAME}
}

PROVIDES += "swupdate-handler"

inherit update-rc.d
INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME = "swupdate-handler.sh"
INITSCRIPT_PARAMS = "start 99 S ."

PACKAGE_ARCH = "${MACHINE_ARCH}"
