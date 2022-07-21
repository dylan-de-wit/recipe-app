<script>
    import Icon from '../lib/icon.svelte'
    import LightDarkModeSwitcher from '../lib/light-dark-mode-switcher.svelte'
</script>

<header>
    <section class="container header-content">
        <div class="logo">
            <Icon/>
        </div>

        <div class="navigation">
            <LightDarkModeSwitcher/>
        </div>
    </section>
</header>

<style lang="scss">
  @import "../styles/theme";

  header {
    background-color: $bg-color;
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    z-index: 1;
    height: 5rem;
    user-select: none;
    box-shadow: rgba(0, 0, 0, 0.1) 0 1px 3px 0, rgba(0, 0, 0, 0.06) 0 1px 2px 0;
  }

  .header-content {
    height: 100%;
    margin: 0 auto;
    display: flex;
    flex-wrap: nowrap;
    align-items: center;
    justify-content: space-between;
  }

  .logo {
    user-select: none;
    cursor: pointer;
  }

  .navigation {
    display: flex;
    flex-wrap: nowrap;
    gap: 1rem;
    font-weight: 500;

    span {
      cursor: pointer;
    }

    @include breakpoint-from($breakpoint-tablet) {
      gap: 2rem;
    }
  }

</style>