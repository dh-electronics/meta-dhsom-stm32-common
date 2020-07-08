
require recipes-bsp/u-boot/u-boot.inc


DESCRIPTION = "U-Boot based on mainline U-Boot used by DH electronics GmbH to support STM32MP1 DHSOMs"
LICENSE = "GPLv2+"
COMPATIBLE_MACHINE = "(dh-stm32mp1-dhcom-common-pdk2|dh-stm32mp1-dhcor-common-avenger96)"
DEPENDS += "flex-native bison-native"

PROVIDES += "u-boot"

S = "${WORKDIR}/git"


PACKAGE_ARCH = "${MACHINE_ARCH}"
