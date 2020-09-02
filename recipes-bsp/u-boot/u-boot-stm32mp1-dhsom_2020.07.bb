include u-boot-stm32mp1-dhsom.inc
require u-boot.inc
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

SRCBRANCH ??= "dev/2020.07_dhsom"

SRC_URI = "\
    git://github.com/dh-electronics/u-boot-stm32mp1.git;protocol=https;branch=${SRCBRANCH}\
    file://boot.cmd \
    file://default-device-tree.cfg \
    file://fw_env.config \
"

DEPENDS += "bc-native dtc-native"

BB_STRICT_CHECKSUM = "0"

# use latest source
SRCREV = "${AUTOREV}"

DEPENDS_append_dh-stm32mp1-dhsom = "u-boot-mkimage-native"
do_compile_append_dh-stm32mp1-dhsom () {
	uboot-mkimage -A arm -T script -C none \
		-d ${WORKDIR}/boot.cmd ${WORKDIR}/boot.scr
}



